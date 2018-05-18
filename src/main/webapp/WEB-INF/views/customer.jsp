<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Product Details</title>
</head>
<body>
	<div>
		<h4>Enter Customer Details</h4>
	</div>
	<form action="/addcustomer"
		method="post">
		<div>
			<label> Title <select>
					<option>Mr.</option>
					<option>Mrs.</option>
					<option>Ms.</option>
			</select><br>
			</label><br> <label id="fn">First Name</label> <input type="text"
				name="firstName" id="fn" placeholder="First Name" required=""><br>

			<label id="ln">Last Name</label> <input type="text" name="lastName"
				id="ln" placeholder="Last Name" required=""><br> <label
				id="sx">Suffix</label> <input type="text" name="suffix" id="sx"
				placeholder="Suffix"><br> <label id="email">E-Mail</label>
			<input type="email" name="email" id="email"
				placeholder="E-Mail Address" required=""><br> <label
				id="cmpny">Company</label> <input type="text" name="Company"
				id="cmpny" placeholder="Company"><br> <label
				id="display">Display Name</label> <input type="text"
				name="displayName" id="display" placeholder="Display Name"><br>

			<label id="check">Print on Check</label> <input type="text"
				name="checkName" id="check" placeholder="Print on Check" required=""><br>

			<label id="st">Billing Street</label> <input type="text"
				name="billingStreet" id="st" placeholder="Billing Street"
				required=""><br> <label id="city">Billing City</label>
			<input type="text" name="city" id="fn" placeholder="Billing City"
				required=""><br> <label> Billing State <select
				name="state">
					<option value="AL">Alabama</option>
					<option value="AK">Alaska</option>
					<option value="AZ">Arizona</option>
					<option value="AR">Arkansas</option>
					<option value="CA">California</option>
					<option value="CO">Colorado</option>
					<option value="CT">Connecticut</option>
					<option value="DE">Delaware</option>
					<option value="DC">District of Columbia</option>
					<option value="FL">Florida</option>
					<option value="GA">Georgia</option>
					<option value="HI">Hawaii</option>
					<option value="ID">Idaho</option>
					<option value="IL">Illinois</option>
					<option value="IN">Indiana</option>
					<option value="IA">Iowa</option>
					<option value="KS">Kansas</option>
					<option value="KY">Kentucky</option>
					<option value="LA">Louisiana</option>
					<option value="ME">Maine</option>
					<option value="MD">Maryland</option>
					<option value="MA">Massachusetts</option>
					<option value="MI">Michigan</option>
					<option value="MN">Minnesota</option>
					<option value="MS">Mississippi</option>
					<option value="MO">Missouri</option>
					<option value="MT">Montana</option>
					<option value="NE">Nebraska</option>
					<option value="NV">Nevada</option>
					<option value="NH">New Hampshire</option>
					<option value="NJ">New Jersey</option>
					<option value="NM">New Mexico</option>
					<option value="NY">New York</option>
					<option value="NC">North Carolina</option>
					<option value="ND">North Dakota</option>
					<option value="OH">Ohio</option>
					<option value="OK">Oklahoma</option>
					<option value="OR">Oregon</option>
					<option value="PA">Pennsylvania</option>
					<option value="RI">Rhode Island</option>
					<option value="SC">South Carolina</option>
					<option value="SD">South Dakota</option>
					<option value="TN">Tennessee</option>
					<option value="TX">Texas</option>
					<option value="UT">Utah</option>
					<option value="VT">Vermont</option>
					<option value="VA">Virginia</option>
					<option value="WA">Washington</option>
					<option value="WV">West Virginia</option>
					<option value="WI">Wisconsin</option>
					<option value="WY">Wyoming</option>
			</select>
			</label><br> <label id="zip">Billing Zip</label> <input type="text"
				name="billingZip" id="zip" placeholder="Zip Code" required=""><br>

			<label id="Country">Billing Country</label> <input type="text"
				name="country" id="Country" placeholder="Billing Country"
				required=""><br> <label id="sStreet">Shipping
				Street</label> <input type="text" name="shippingStreet" id="sStreet"
				placeholder="Shipping Street" required=""><br> <label
				id="sCity">Shipping City</label> <input type="text"
				name="shippingCity" id="sCity" placeholder="Shipping City"
				required=""><br> <label> Shipping State <select
				name="shippingState">
					<option value="AL">Alabama</option>
					<option value="AK">Alaska</option>
					<option value="AZ">Arizona</option>
					<option value="AR">Arkansas</option>
					<option value="CA">California</option>
					<option value="CO">Colorado</option>
					<option value="CT">Connecticut</option>
					<option value="DE">Delaware</option>
					<option value="DC">District of Columbia</option>
					<option value="FL">Florida</option>
					<option value="GA">Georgia</option>
					<option value="HI">Hawaii</option>
					<option value="ID">Idaho</option>
					<option value="IL">Illinois</option>
					<option value="IN">Indiana</option>
					<option value="IA">Iowa</option>
					<option value="KS">Kansas</option>
					<option value="KY">Kentucky</option>
					<option value="LA">Louisiana</option>
					<option value="ME">Maine</option>
					<option value="MD">Maryland</option>
					<option value="MA">Massachusetts</option>
					<option value="MI">Michigan</option>
					<option value="MN">Minnesota</option>
					<option value="MS">Mississippi</option>
					<option value="MO">Missouri</option>
					<option value="MT">Montana</option>
					<option value="NE">Nebraska</option>
					<option value="NV">Nevada</option>
					<option value="NH">New Hampshire</option>
					<option value="NJ">New Jersey</option>
					<option value="NM">New Mexico</option>
					<option value="NY">New York</option>
					<option value="NC">North Carolina</option>
					<option value="ND">North Dakota</option>
					<option value="OH">Ohio</option>
					<option value="OK">Oklahoma</option>
					<option value="OR">Oregon</option>
					<option value="PA">Pennsylvania</option>
					<option value="RI">Rhode Island</option>
					<option value="SC">South Carolina</option>
					<option value="SD">South Dakota</option>
					<option value="TN">Tennessee</option>
					<option value="TX">Texas</option>
					<option value="UT">Utah</option>
					<option value="VT">Vermont</option>
					<option value="VA">Virginia</option>
					<option value="WA">Washington</option>
					<option value="WV">West Virginia</option>
					<option value="WI">Wisconsin</option>
					<option value="WY">Wyoming</option>
			</select>
			</label><br> <label id="sZip">Shipping Zip</label> <input type="text"
				name="shippingZip" id="sZip" placeholder="Shipping Zip" required=""><br>

			<label id="sCountry">Shipping Country</label> <input type="text"
				name="shippingCountry" id="sCountry" placeholder="Shipping Country"
				required=""><br> <label id="otherdetails">Other
				Details</label> <input type="text" name="otherDetails" id="otherdetails"
				placeholder="Other Details"><br>
			<input type="submit" value="Save">
		</div>

	</form>

</body>
</html>