To CREAT a product
curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"Headphones\",\"price\":123.45}" http://localhost:8000/product
curl -X POST -H "Content-Type:application/json" -d "{\"name\":\"Shoes \",\"price\":678.99 }" http://localhost:8000/product
To READ a product
curl -X GET http://localhost:8000/products
curl -X GET http://localhost:8000/products/1
To CREAT an account
curl -X POST -d "{\"name\":\"John Doe\",\"email\":\"aal786@uowmail.edu.au\",\"phone\":\"0426010227\",\"address\":\"2 Northfields Ave, Keiraville NSW 2500\"}" -H "Content-Type:application/json" http://localhost:8000/account
curl -X POST -d "{\"name\":\"Dummy Account2 \",\"email\":\"ddd@uowmail.edu.au\",\"phone\":\"041234567\",\"address\":\"2 Northfields Ave, Keiraville NSW 2500\"}" -H "Content-Type:application/json" http://localhost:8000/account
To READ and account
curl -X GET http://localhost:8000/accounts
curl -X GET http://localhost:8000/accounts/1

