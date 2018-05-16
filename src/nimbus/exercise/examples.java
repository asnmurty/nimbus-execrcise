package nimbus.exercise;


public class examples {

	

	@Bean(name="default.rep_mongodb_handler")
	public DefaultMongoModelPersistenceHandler defaultMongoModelPersistenceHandler(@Qualifier("default.rep_mongodb") ModelRepository rep){
		return new DefaultMongoModelPersistenceHandler(rep);
	}
	
	@Bean(name="default.rep_mongodb")
	public DefaultMongoModelRepository defaultMongoModelRepository(MongoOperations mongoOps, IdSequenceRepository idSequenceRepo, BeanResolverStrategy beanResolver){
		return new DefaultMongoModelRepository(mongoOps, idSequenceRepo, beanResolver);
	}
	
	@Bean
	public MongoIdSequenceRepository mongoIdSequenceRepository(MongoOperations mongoOperations){
		return new MongoIdSequenceRepository(mongoOperations);
	}
}
