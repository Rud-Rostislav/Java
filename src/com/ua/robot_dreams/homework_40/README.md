POST Country

{
"name": "Україна",
"population": 45000000,
"cities": [
{
"name": "Київ",
"population": 2800000,
"capital": true
},
{
"name": "Львів",
"population": 720000,
"capital": false
}
]
}

POST City

{
"name": "Одеса",
"population": 1000000,
"capital": false,
"country": {
"id": 1
}
}
