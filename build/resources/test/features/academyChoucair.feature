
  #Autor: Xiomara Cortes
    @stories
    Feature: Academy Choucair
      as a user, acquire knowledge through the course "Bancolombia automation resources" based on the Screenplay
      pattern at the Choucair academy.
      @scenario1
    Scenario: Search for a automation course
        Given :Maria wants to learn from the resource automation course
        | strUser  | strPassword |
        | TuUsuario  | TuClave |
        When :She after searching in the browser for the choucair academy look in the categories bancolombia automation resources
          | strUser  |
          | Metodologia Bancolombia|
        Then : she verifies that the title of the page is bancolombia automation resources
          | StrCourse  |
          | Metodologia Bancolombia|