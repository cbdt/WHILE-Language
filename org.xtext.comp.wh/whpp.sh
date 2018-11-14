java -jar whpp.jar "$@"
args=("$@")
count=0
has_o=0
for i in $@
do
 (( count++ ))
 if [ $i == "-o" ]
 then
    has_o=1
    cat ${args[count]}
 fi
done

if [ $has_o == 0 ]
then
    cat sth.whpp
fi
