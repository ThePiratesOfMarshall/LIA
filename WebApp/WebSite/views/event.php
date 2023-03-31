<?php

    class Event {
        private int $id;
        private string $title;
        private string $description;
        private string $date;

        public function __construct($id = 0, $title = "GenericTitle", $description = "GenericDescription", $date = "30/01/1933") {
            $this -> id = $id;
            $this -> title = $title;
            $this -> description = $description;
            $this -> date = $date;
        }

        //metodi get
        public function getId(){
            return $this -> id;
        }

        public function getTitle(){
            return $this -> title;
        }
        
        public function getDescription(){
            return $this -> description;
        }

        //metodi set
        public function setId($id){
            $this->id = $id;
        }
        public function setDescr($descr){
            $this->descr = $descr;
        }
        public function setValue($value){
            $this->value = $value;
        }

    }

?>