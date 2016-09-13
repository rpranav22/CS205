find . -name ‘*.txt’ | xargs -I{} tail -5 {} >> allmixedLast5
