mybatis自动生成代码:

一、准备工作（这次已经做好）：
	1、为文件generatorConfig.xml配置tableName="user_t" domainObjectName="User"连个属性(表名和类名)
	2、创建替换mapper中关于处理“带下划线或小写的单词”的parse*Mapper.sh
	

二、执行批处理文件：
	startCmder.bat启动cmder
	
	(注意：bat文件里路径已配好，可以改)


三、在弹出窗口执行：
	e:
	进入项目路径（例如cd E:\Workspaces\MyEclipse 8.5\shezhangbao\generateMybatisCode）
	sh generateAndreplaceMappers.sh

	这会产生 pojo、dao、mapping，并依次对mapper替换带下划线或小写的单词


四、将生成的代码拷贝到目标包里，完成。


备用：用user_t这种带_t的临时表(字段名称的单词之间用下划线连接)生成pojo、dao、mapping
备用：java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
备用：获取行号line=`sed -n '$=' myfile.txt`
