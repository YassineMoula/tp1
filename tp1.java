class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
 
    public Personne() {
        this("Ben ALI", "Med", 30, "M");
    }
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    } 
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
    public String getSexe() {
        return sexe;
    }
    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Sexe : " + sexe);
    }
    public boolean sameLastName(Personne p) {
        if (p == null) {
            return false;
        }
        
    }
