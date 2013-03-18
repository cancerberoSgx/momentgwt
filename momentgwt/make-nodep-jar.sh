#generates a .jar with all dependencies packaged inside. 
#author: sgurin

#first, read sh variables from build.properties
for line in $(< build.properties)  
do  
  case $line in  
    gwtEditorJar=*)  eval $line ;; # beware! eval!  
    gwtSliderBarJar=*)   eval $line ;; # dito!
    gwtFileJar=*)   eval $line ;; # dito!    
    *) ;;  
   esac  
done  

rm -rf jartmp
mkdir jartmp
cd jartmp
unzip -u ../$gwtEditorJar
unzip -u ../$gwtSliderBarJar
unzip -u ../$gwtFileJar
zip -r gwteditors-alldeps.jar *
mv gwteditors-alldeps.jar ../target
cd ..
rm -rf jartmp
