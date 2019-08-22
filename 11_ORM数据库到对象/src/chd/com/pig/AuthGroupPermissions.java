package chd.com.pig;
public class AuthGroupPermissions{
	private Integer permissionId;
	private Integer groupId;
	private Integer id;
	public void setPermissionId (Integer permissionId){this.permissionId = permissionId;	}
	public void setGroupId (Integer groupId){this.groupId = groupId;	}
	public void setId (Integer id){this.id = id;	}
	public Integer getPermissionId (){return this.permissionId;	}
	public Integer getGroupId (){return this.groupId;	}
	public Integer getId (){return this.id;	}
}