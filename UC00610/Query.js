use escola


     db.aula3.insertMany([
  {
    nome: "Ana",
    idade: 20,
    curso: "Programação",
    notas: [14, 16],
    ativo: true
  },
  {
    nome: "Bruno",
    idade: 23,
    curso: "Redes",
    notas: [12, 15],
    ativo: true
  },
  {
    nome: "Carla",
    idade: 19,
    curso: "Programação",
    notas: [17, 18],
    ativo: false
  }
])


    db.aula3.find({
        $and:[
            {curso:"Programação"},
            {idade: 20 }
        ]
    },{
        _id:0
        })

    db.aula3.find({
        curso:"Programação",
        idade: 20
    },{_id:0})


        db.aula3.find({
        $or:[
            {   curso:"Programação",
                idade:20
             },
            {idade: 23 }
        ]
    },{
        _id:0
        })


    // sort


    db.aula3.find({},{_id:0, notas:0}).sort({curso: 1, idade:-1})


    db.aula3.find({},{_id:0, notas:0})

    db.aula3.deleteOne({})

    db.aula3.find({},{_id:0, notas:0})



        db.aula3.deleteOne({nome:"Ana"})

        db.aula3.find({},{_id:0, notas:0})


     db.aula3.deleteMany({ativo:false})

      db.aula3.find({},{_id:0, notas:0})




db.aula3.updateOne({nome:"Bruno"},{

    $set:{
        curso: "Gestão"
    }

})

      db.aula3.find({},{_id:0, notas:0})

    db.aula3.updateMany({
        $or:[
            {curso:"Programação"},
            {curso: "Redes"}
            ]
    },{

    $set:{
        Area: "IT"
    }
})

 db.aula3.find({},{_id:0})


        db.aula3.updateMany({
        $or:[
            {curso:"Programação"},
            {curso: "Redes"}
            ]
    },{

    $unset:{
        Area: ""
    }
})


     db.aula3.find({},{_id:0})

        db.aula3.updateOne({
            nome:"Bruno"
    },{

    $push:{
        notas: 19
    }
})


  db.aula3.find({},{_id:0})
            db.aula3.updateOne({
            nome:"Bruno"
    },{

    $pop:{
        notas: 1
    }
})

      db.aula3.find({},{_id:0})




     db.aula3.find({},{_id:0})

        db.aula3.updateOne({
            nome:"Bruno"
    },{

    $push:{
        notas: 19
    }
})


  db.aula3.find({},{_id:0})
            db.aula3.updateOne({
            nome:"Bruno"
    },{

    $pop:{
        notas: -1
    }
})


      db.aula3.find({},{_id:0})


   // db.Alunos.drop()


    // db.dropDatabase()



// 1. Inserir pelo menos cinco alunos
// 2. Mostrar todos os alunos
// 3. Mostrar alunos do curso de Programação
// 4. Mostrar alunos com idade superior a 20
// 5. Alterar o curso de um aluno
// 6. Adicionar uma nota ao array de notas
// 7. Remover uma nota
// 8. Eliminar um aluno
// 9. Contar os alunos ativos
// 10. Ordenar os alunos por idade


    db.createCollection("Compras")

    db.Compras.insertMany([
    {
        nome: "Portátil Lenovo",
        preco: 899.99,
        categoria: "Informática",
        stock: 10
    },
    {
        nome: "Rato Logitech",
        preco: 29.99,
        categoria: "Acessórios",
        stock: 25
    },
    {
        nome: "Teclado Mecânico",
        preco: 79.90,
        categoria: "Acessórios",
        stock: 8
    },
    {
        nome: "Monitor Samsung",
        preco: 249.99,
        categoria: "Informática",
        stock: 5
    }
])


    db.Compras.aggregate([
        {
            $group:{
                _id: null, //"$categoria",
                maxPrice: { $max: "$preco" },
                minPrice: { $min: "$preco" },
                avgPrice: { $avg: "$preco" }
            }
        },
        {
            $project: {
                _id:0,
                maxPrice:1,
                minPrice:1,
                avgPrice:{
                    $round:["$avgPrice", 2]
                }

            }
        }
        ])





