cat < Readme.txt | xargs -n1 | sort | uniq -c > No_of_words
