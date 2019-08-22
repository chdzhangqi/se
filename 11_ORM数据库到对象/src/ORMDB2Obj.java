import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;

/**
 * ORMDB2Obj类用于将数据库表映射到Java中的对象
 */
public class ORMDB2Obj {
    /**
     * 1. 先连接数据库，获取数据库信息
     * 2. 根据数据库信息，创建出对象文件
     */

    /**
     * 获取数据库信息，并返回数据库信息
     *
     * @return
     * @throws Exception
     */
    public void db2Obj() throws Exception {
        createObject(getDBMessage(), "chd.com.pig");
    }


    private List<TableMessage> getDBMessage() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://47.102.220.245:3306/Crew", "root", "zhangqi");

        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet tables = metaData.getTables("Crew", null, null, null);
        List<TableMessage> tableMessages = new ArrayList<>();
        while (tables.next()) {
            String tableName = tables.getString(3); // 获取数据库中的表名
            ResultSet columns = metaData.getColumns("Crew", null, tableName, null);
            TableMessage tableMessage = new TableMessage();
            tableMessage.tableName = Utils.getClassName(tableName);
            while (columns.next()) {
                tableMessage.columnMap.put(Utils.getFieldName(columns.getString(4)), columns.getString(6));
            }
            tableMessages.add(tableMessage);
        }
        return tableMessages;
    }

    private void createObject(List<TableMessage> messages, String path) throws Exception {
        for (TableMessage table : messages) {
            StringBuilder sb = new StringBuilder();
            sb.append("package " + path + ";\n");
            for (String filed : new TreeSet<>(table.columnMap.values())) {
                if (Utils.getImport(filed) != null)
                    sb.append(Utils.getImport(filed) + "\n");
            }
            sb.append("public class " + table.tableName + "{\n");
            for (String filed : table.columnMap.keySet()) {
                sb.append("\tprivate " + Utils.getVar(table.columnMap.get(filed)) + " " + Utils.getFieldName(filed) + ";\n");
            }

            for (String filed : table.columnMap.keySet()) {
                sb.append("\tpublic void set" + Utils.getMethodName(filed) + " (" + Utils.getVar(table.columnMap.get(filed))
                        + " " + Utils.getFieldName(filed)
                        + "){");
                sb.append("this." + Utils.getFieldName(filed) + " = " + Utils.getFieldName(filed) + ";");
                sb.append("\t}\n");
            }

            for (String filed : table.columnMap.keySet()) {
                sb.append("\tpublic "+Utils.getVar(table.columnMap.get(filed))+" get" + Utils.getMethodName(filed) + " (){");
                sb.append("return this." + Utils.getFieldName(filed) + ";");
                sb.append("\t}\n");
            }
            sb.append("}");
            File file = new File(createPackage(path) + File.separator + table.tableName + ".java");
            FileOutputStream f = new FileOutputStream(file);
            f.write(sb.toString().getBytes());
            f.close();
        }
    }

    private String createPackage(String packagePath) throws IOException {
        String canonicalPath = new File("").getCanonicalPath();
        canonicalPath += File.separator + "src";
        String[] paths = packagePath.split("\\.");
        for (String path : paths) {
            canonicalPath += File.separator + path;
        }
        new File(canonicalPath).mkdirs();
        return canonicalPath;
    }

    class TableMessage {
        public String tableName;
        public Map<String, String> columnMap = new HashMap<>();

        @Override
        public String toString() {
            return "TableMessage{" +
                    "tableName='" + tableName + '\'' +
                    ", columnMap=" + columnMap +
                    '}';
        }
    }

    static class Utils {
        private static Map<String, String> IMPORT_MESSAGE;
        private static Map<String, String> VAR_MESSAGE;

        static {
            IMPORT_MESSAGE = new HashMap<>();
            VAR_MESSAGE = new HashMap<>();
            IMPORT_MESSAGE.put("DATETIME", "import java.util.Date;\n");
            VAR_MESSAGE.put("VARCHAR", "String");
            VAR_MESSAGE.put("INT", "Integer");
            VAR_MESSAGE.put("DATETIME", "Date");
            VAR_MESSAGE.put("LONGTEXT", "String");
            VAR_MESSAGE.put("BIT", "Byte");
        }

        public static String getClassName(String name) {
            String[] names = name.split("_");
            String retName = "";
            for (String n : names) {
                retName += n.substring(0, 1).toUpperCase() + n.substring(1, n.length());
            }
            return retName;
        }

        public static String getFieldName(String name) {
            String[] names = name.split("_");
            String retName = "";
            for (int i = 0; i < names.length; i++) {
                if (i == 0) {
                    retName += names[i];
                } else {
                    retName += names[i].substring(0, 1).toUpperCase() + names[i].substring(1, names[i].length());
                }
            }
            return retName;
        }

        public static String getMethodName(String name) {
            String retString = getFieldName(name);
            return retString.substring(0, 1).toUpperCase() + retString.substring(1, retString.length());
        }

        public static String getImport(String v) {
            return IMPORT_MESSAGE.get(v);
        }

        public static String getVar(String v) {
            return VAR_MESSAGE.get(v);
        }
    }
}
