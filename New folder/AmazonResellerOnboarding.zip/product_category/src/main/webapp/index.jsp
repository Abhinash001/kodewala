<!DOCTYPE html>
<html>
<head>
<title>Create Product</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

<style>
body {
    margin: 0;
    font-family: 'Poppins', sans-serif;
    background: linear-gradient(135deg, #ff6ec4, #7873f5, #42e695);
    background-size: 400% 400%;
    animation: gradientBG 10s ease infinite;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

/* Animated background */
@keyframes gradientBG {
    0% {background-position: 0% 50%;}
    50% {background-position: 100% 50%;}
    100% {background-position: 0% 50%;}
}

/* Glass effect container */
.container {
    background: rgba(255, 255, 255, 0.15);
    backdrop-filter: blur(15px);
    padding: 35px;
    border-radius: 20px;
    width: 420px;
    box-shadow: 0 10px 40px rgba(0,0,0,0.3);
    color: white;
    animation: fadeIn 0.8s ease-in-out;
}

@keyframes fadeIn {
    from {opacity: 0; transform: translateY(30px);}
    to {opacity: 1; transform: translateY(0);}
}

h2 {
    text-align: center;
    margin-bottom: 15px;
}

h3 {
    margin-top: 20px;
    border-left: 4px solid #fff;
    padding-left: 10px;
}

/* Input group */
.input-group {
    position: relative;
    margin-top: 15px;
}

.input-group i {
    position: absolute;
    top: 12px;
    left: 10px;
    color: #ddd;
}

input[type="text"] {
    width: 100%;
    padding: 10px 10px 10px 35px;
    border-radius: 8px;
    border: none;
    outline: none;
    margin-top: 5px;
    font-size: 14px;
    background: rgba(255,255,255,0.2);
    color: white;
}

input::placeholder {
    color: #eee;
}

input:focus {
    box-shadow: 0 0 10px rgba(255,255,255,0.6);
}

/* Button */
.btn {
    width: 100%;
    margin-top: 25px;
    padding: 12px;
    border: none;
    border-radius: 30px;
    background: linear-gradient(45deg, #ff9a9e, #fad0c4);
    color: #333;
    font-size: 16px;
    font-weight: bold;
    cursor: pointer;
    transition: 0.3s;
}

.btn:hover {
    transform: scale(1.05);
    box-shadow: 0 5px 20px rgba(0,0,0,0.3);
}

/* Glow labels */
label {
    font-size: 13px;
    margin-top: 8px;
    display: block;
    color: #fff;
}
</style>
</head>

<body>

<div class="container">

    <h2>🚀 Create Product</h2>

    <form action="createCategory" method="post">

        <h3>📂 Category Details</h3>

        <div class="input-group">
            <i class="fa fa-tag"></i>
            <input type="text" name="categoryName" placeholder="Category Name">
        </div>

        <div class="input-group">
            <i class="fa fa-align-left"></i>
            <input type="text" name="categoryDescription" placeholder="Category Description">
        </div>

        <div class="input-group">
            <i class="fa fa-toggle-on"></i>
            <input type="text" name="categoryStatus" placeholder="Active / Inactive">
        </div>


        <h3>🛒 Product Details</h3>

        <div class="input-group">
            <i class="fa fa-box"></i>
            <input type="text" name="productName" placeholder="Product Name">
        </div>

        <div class="input-group">
            <i class="fa fa-file-alt"></i>
            <input type="text" name="productDescription" placeholder="Product Description">
        </div>

        <div class="input-group">
            <i class="fa fa-check-circle"></i>
            <input type="text" name="productStatus" placeholder="Available / Out of Stock">
        </div>

        <input type="submit" value="✨ Submit Product" class="btn">

    </form>

</div>

</body>
</html>