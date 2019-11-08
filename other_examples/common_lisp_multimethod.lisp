;;ONLINE COMPILER LINK: https://rextester.com/l/common_lisp_online_compiler

;gnu clisp 2.49

(defclass asteroid () 
    (())
)
(defclass spaceship ()
    (())
)

(defmethod collide-with ((x asteroid) (y asteroid))
    (print "Asteroid <--> Asteroid")
)
(defmethod collide-with ((x asteroid) (y spaceship))
    (print "Asteroid <--> Spaceship")
)
(defmethod collide-with ((x spaceship) (y asteroid))
    (print "Spaceship <--> Asteroid")
)
(defmethod collide-with ((x spaceship) (y spaceship))
    (print "Spaceship <--> Spaceship")
)

(defvar a (make-instance 'asteroid))
(defvar s (make-instance 'spaceship))

(collide-with a a)
(collide-with a s)
(collide-with s a)
(collide-with s s)
