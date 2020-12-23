<?php
	define("DB_HOST", "localhost");
    define("DB_USER", "root");
    define("DB_PASSWORD", "");
    define("DB_NAME", "dnlaravel");    
    class DbConnect{
        
        private $connect;
        
        public function __construct(){
            
            $this->connect = mysqli_connect(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);
            
            if (mysqli_connect_errno($this->connect)){
                echo "Unable to connect to MySQL Database: " . mysqli_connect_error();
            }
        }
        
        public function getDb(){
            return $this->connect;
        }
    }
?>
