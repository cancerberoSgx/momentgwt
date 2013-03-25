#generates a .jar with all dependencies packaged inside. 
#author: sgurin

gwtjsutilJar="/home/sebastian/workspace 3.7rc2/gwtjsutil/target/gwtjsutil-1.0.jar"
momentgwtJar="/home/sebastian/git/momentgwt/momentgwt/target/momentgwt-1.0.jar"
outputJarName=momentgwt-1.0-alldeps.jar

rm -rf jartmp
mkdir jartmp
cd jartmp
unzip -u "$gwtjsutilJar"
unzip -u "$momentgwtJar"
zip -r $outputJarName *
mv $outputJarName ../target
cd ..
rm -rf jartmp
