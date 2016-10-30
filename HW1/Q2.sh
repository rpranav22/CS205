find . -name ‘*.txt’ | xargs -I{} tail -5 {} >> allmixedLast5
