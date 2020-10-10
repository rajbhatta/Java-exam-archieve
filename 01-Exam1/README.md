## Testing Coding skills

## Question 1:​ There is a secret string which is unknown to you. Given a collection of random triplets from the string, recover the original string.
A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in the given string. ['w', 'h', 'i'] is a triplet for the string 'whatisup'.
As a simplification, you may assume that no letter occurs more than once in the secret string.
You can assume nothing about the triplets given to you other than that they are valid triplets and that they contain sufficient information to deduce the original string. In particular, this means that the secret string will never contain letters that do not occur in one of the triplets given to you.

```
#secret="whatisup"
triplets ​= ​
[ 	[​'t'​,​'u'​,​'p'​],
	[​'w'​,​'h'​,​'i'​], 
	[​'t'​,​'s'​,​'u'​],
 	[​'a'​,​'t'​,​'s'​],
 	[​'h'​,​'a'​,​'p'​],
 	[​'t'​,​'i'​,​'s'​],
 	[​'w'​,​'h'​,​'s'​] 
]
```

## Question 2:​ The goal is to implement simple calculator which uses fluent syntax: 
```
Calc.new.one.plus.two # Should return 3 
Calc.new.five.minus.six # Should return -1 
Calc.new.seven.times.two # Should return 14 
Calc.new.nine.divided_by.three # Should return 3
```
