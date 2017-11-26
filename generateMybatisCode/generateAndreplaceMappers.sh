cd E:\Workspaces\MyEclipse 8.5\szb\generateMybatisCode
rm -r .\\src\\com\\szb 
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
ls *Mapper.sh > mapperlist.sh
sed -i 's/parse/sh parse/g' mapperlist.sh
line=`sed -n '$=' mapperlist.sh` 
echo "this job needs a few minutes,please waite...filenum=$line"
sh mapperlist.sh


