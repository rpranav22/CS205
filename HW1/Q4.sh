find . -name '*.txt' | xargs -I{} grep -ir the . | wc -l >>Number
