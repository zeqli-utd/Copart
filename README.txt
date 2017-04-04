Group Member 
Xin Yang yangxin0@gmail.com
Zeqing Li zeqing.li@utdallas.edu

1. Most Appropriate Facility: code by Xin Yang

At the beginning, import net.sf.json.JSONObject, org.apache.commons.collections.CollectionUtils, org.apache.commons.lang.StringUtils, and some other basic java packages.

To implement, Firstly, I will use a customer’s ID to query data in mysql. If the customer has a preference, it is returned.

Then check the postal code in mysql. If I can find a facility locate in the specified zipcode, then return it. If I can’t find it, then try to find the closest one. For this part, I use API in http://www.zipcodeapi.com/ . The API will help me to find all zip codes within a given radius of a zip code. So there’s a loop to increase radius until I can find a zipcode which Copart facilities locate in. This loop has MAX_TRY_TIMES setting to avoid overtime proceeding.


2. Convert String to Integer: code by Xin Yang

This method checks the input string character by character. If the checked character is a digit, it will check the next charcater until all the characters have been checked. This method sum the integer by 10 * (previous sum) + current integer.
This method will ask the user to input a string, if the string is too long (exceeding the range of integer), it will the Max or Min integer. And it will return integer/2 to prove that it is an integer.


3. License Keys: code by Xin Yang

This method applies StringBuilder to check "-" and form a new key with needed integer K and then switch it to upper case.
This method scan the string from the end to the head. It will ask the user to input the keystring and form a new key.

4. Variation of Most Appropriate Yard: code by Xin Yang

Let the pick up location at latitude x,longitude y. Select one position at latitude xi,longitude yi,
Scan all the positions to find the smallest r=sqrt((x-xi)^2+(x-yi)^2) as the closest position.
We can narrow down the search area to speed up this method.

5. JS Library/framework* based - Nested ListView: code by Zeqing Li

The Nestedd ListView demo will take mock request Json object as input, display the Countries, States, and Cities in a nested view. The application will process Json request input and update the existing data in the memory.
This feature is implemented in Angular 2.