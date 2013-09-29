#generates a .jar with all dependencies packaged inside. 
#author: sgurin

gwtjsutilJar="/home/sg/workspace/gwtjsutil/target/gwtjsutil-1.0.jar" #must be absolute
momentgwtJar="/home/sg/git/momentgwt/momentgwt/target/momentgwt-1.0.jar" #must be absolute
outputJarName=/home/sg/git/momentgwt/momentgwt/target/momentgwt-1.0-alldeps.jar #must be absolute

rm -rf jartmp
mkdir jartmp
cd jartmp
unzip -u "$gwtjsutilJar"
unzip -u "$momentgwtJar"

#echo "" > $outputJarName
zip -r $outputJarName *
mv $outputJarName ../target
cd ..
rm -rf jartmp
