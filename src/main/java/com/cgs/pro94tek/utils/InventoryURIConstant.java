package com.cgs.pro94tek.utils;

public class InventoryURIConstant {
	
	public static final String DUMMY_URI = "/protek/emp/dummy";
	public static final String AUTHENTICATE_USER = "/protek/authenticate/{username}/{password}";
	public static final String GET_INVENTORY_DETAILS = "/protek/inventory/details/{id}";
	public static final String GET_PATIENT_VOUCHER_DETAILS = "/protek/patientvoucher/details/{userid}";
	public static final String GET_CATEGORY_DETAILS = "/protek/category/details/{id}";
	public static final String POST_CATEGORY_DETAILS = "/protek/category";
	
	public static final String GET_SCHOOL_DETAILS = "/protek/school/details/{schoolId}";
	public static final String CREATE_SCHOOL_DETAILS = "/protek/school";
	public static final String PUT_SCHOOL_DETAILS = "/protek/school/details/update/{schoolId}";
	public static final String DELETE_SCHOOL_DETAILS = "/protek/school/details/delete/{schoolId}";
	
	public static final String GET_INVENTORY_BANK_DETAILS = "/protek/inventory/bank/details/{id}";
	public static final String CREATE_INVENTORY = "/protek/inventory/create";
	public static final String DELETE_INVENTORY_BANK = "/protek/inventory/bank/delete/{id}";
	public static final String CREATE_INVENTORY_BANK = "/protek/inventory/bank/create";
	
	public static final String GET_TAX_DETAILS = "/protek/tax/details/{taxId}";
	public static final String CREATE_TAX_DETAILS = "/protek/create/tax";
	public static final String PUT_TAX_DETAILS = "/protek/tax/details/update/{taxId}";
	public static final String DELETE_TAX_DETAILS = "/protek/tax/details/delete/{taxId}";
	
	public static final String GET_CHARGE_DETAILS = "/protek/charge/details/{chargeId}";
	public static final String CREATE_CHARGE_DETAILS = "/protek/charge";
	public static final String PUT_CHARGE_DETAILS = "/protek/charge/details/update/{chargeId}";
	public static final String DELETE_CHARGE_DETAILS = "/protek/charge/details/delete/{chargeId}";
	
	public static final String GET_SERVICE_DETAILS = "/protek/service/details/{serviceId}";
	public static final String CREATE_SERVICE_DETAILS = "/protek/service";
	public static final String PUT_SERVICE_DETAILS = "/protek/service/details/update/{serviceId}";
	public static final String DELETE_SERVICE_DETAILS = "/protek/service/details/delete/{serviceId}";
	public static final String CREATE_SERVICE_MULTIPLE_DETAILS ="/protek/service/details/insert/multiple";
	public static final String GET_MULTIPLE_SERVICE_DETAILS ="/protek/service/get/multipule/details";
	public static final String CREATE_SERVICE_FILE_UPLOAD ="/protek/service/fileupload/create";
	
	public static final String GET_WARD_DETAILS = "/protek/ward/details/{wardId}";
	public static final String CREATE_WARD_DETAILS = "/protek/ward";
	public static final String PUT_WARD_DETAILS = "/protek/ward/details/update/{wardId}";
	public static final String DELETE_WARD_DETAILS = "/protek/ward/details/delete/{wardId}";
	
	public static final String GET_COMPANY_DETAILS = "/protek/company/details/{companyId}";
	public static final String CREATE_COMPANY_DETAILS = "/cgs/create/company/details";
	public static final String PUT_COMPANY_DETAILS = "/protek/company/details/update/{companyId}";
	public static final String DELETE_COMPANY_DETAILS = "/protek/company/details/delete/{companyId}";
	
	public static final String GET_ROOM_DETAILS = "/protek/room/details/{roomId}";
	public static final String CREATE_ROOM_DETAILS = "/protek/room";
	public static final String PUT_ROOM_DETAILS = "/protek/room/details/update/{roomId}";
	public static final String DELETE_ROOM_DETAILS = "/protek/room/details/delete/{roomId}";
	
	public static final String GET_SUPPLIER_DETAILS = "/protek/supplier/details/{supplierId}";
	public static final String CREATE_SUPPLIER_DETAILS = "/protek/supplier";
	public static final String PUT_SUPPLIER_DETAILS = "/protek/supplier/details/update/{supplierId}";
	public static final String DELETE_SUPPLIER_DETAILS = "/protek/supplier/details/delete/{supplierId}";
	public static final String GET_ALL_SUPPLIRE_DETAILS ="/protek/suppliar/all/details/get";
	
	
	public static final String GET_CUSTOMER_DETAILS = "/protek/customer/details/{customerId}";
	public static final String CREATE_CUSTOMER_DETAILS = "/protek/customer/create/deta";
	public static final String PUT_CUSTOMER_DETAILS = "/protek/customer/details/update/{customerId}";
	public static final String DELETE_CUSTOMER_DETAILS = "/protek/customer/details/delete/{customerId}";
	public static final String CREATE_CUSTOMER_DETAILS_MULTIPLE ="/protek/customer/create/mul/details";
																							
	public static final String GET_EXPENSES_ID="/protek/expenses/details/{expensesId}";
	public static final String DELETE_EXPENSES_ID="/protek/expenses/details/delete/{expensesId}";
	public static final String CREATE_EXPENSES_DETAILS = "/protek/expenses";
	
	
	public static final String GET_SPECIALOFFER = "/protek/specialoffer/details/{officeId}";
	public static final String DELETE_SPECIALOFFER_ID="/protek/specialoffer/delete/{officeId}";
	public static final String CREATE_SPECIALOFFER_DETAILS ="/protek/specialoffer/createOrUpdate";
	
	
	public static final String GET__ID = "/protek//details/{Id}";
	public static final String DELETE__ID = "/protek//delete/{Id}";
	public static final String CREATE__DETAILS = "/protek/create/details";
	public static final String GET_ALL__DETAILS ="/protek//getall/details";
	
	public static final String GET_REFERAL_ID ="/protek/referal/details/{referalId}";
	
	
	public static final String GET_REFERALRATE_ID="/protek/referalrate/details/{referalRateId}";
	public static final String GET_PRICE_DETAILS ="/protek/price/details/{PriceId}";
	public static final String GET_MYUSER_DETAILS = "/protek/myuser/details/{username}";
	public static final String NEWUSER_USERNAME_PASSWORD  = "/protek/myuser/{username}/{password}";
	public static final String GET_ITEMPRICE_DETAILS ="/protek/itemprice/details/{itemPriceId}";
	
	public static final String GET_PURCHAGEORDER_DETAILS ="/protek/purchageOrder/details/{medicineName}";
	public static final String DELETE_PURCHAGEORDER_DETAILS ="/protek/purchageOrder/delete/{Id}";
	public static final String CREATE_PURCHAGE_DETAILS ="/protek/purchageOrder/create";
	public static final String GET_PURCHAGEORDER_ALL_DETAILS ="/protek/purchageOrder/getall/details/{mName}";
	public static final String GET_PURCHAGEORDER_ALL_DETAILS_STATIC ="/purchageOrder/getall/bydeafault";
	public static final String CREATE_MULTIPLE_PURCHAGEORDER_DETAILS ="/protek/purchageOrder/create/multipulerecords";
	
																		
	public static final String GET_QUANTITY_DETAILS="/protek/quatation/details/{purchageId}";
	public static final String CREATE_QUANTITY_DETAILS="/protek/quatation/create";
	public static final String GETALL_QUATATION_DETAILS="/protek/quatation/getall/details";
	public static final String CREATE_MULTIPLE_QUATATIONS ="/protek/quatation/insert/all/records";
	
	public static final String CREATE_INWARD_DETAILS="/protek/inward/created/details";
	public static final String GET_INWARD_PID="/protek/inward/details/{pId}";
	
	
	public static final String GET_INWARDDATA_DETAILS="/protek/inwarddata/details/{porderid}";
	public static final String CREATE_INWARDDATA_DETAILS="/protek/inwarddata/create";
	
	public static final String GET_LAND_DETAILS="/protek/land/details/{landid}";
	public static final String DELETE_LAND_ID="/protek/land/delete/{landid}";
	public static final String CREATE_LAND_ID="/protek/land/create";
	
	public static final String GET_LANDPROPETY_ID="/protek/landpropety/details/{propertyid}";
	public static final String DELETE_lANDPROPERTY_ID="/protek/landpropery/delete/{propertyid}";
	public static final String CREATE_LANDPROPERT="/protek/landpropety/create";
	
	public static final String GET_CONSTRUCTION_ID="/protek/construction/details/{constrId}";
	public static final String DELETE_CONSTAUCTION_ID="/protek/construction/delete/{constrId}";
	public static final String CREATE_CONSTRUCTION="/protek/construction/create";
	
	public static final String GET_AGENT_ID="/protek/agent/details/{agentName}";
	public static final String CREATE_AGENT_DETAILS="/protek/agent/create";
	public static final String DELETE_AGENTS_ID="/protek/agent/delete/{agentName}";
	
	public static final String GET_DEALER_DETAILS="/protek/dealer/details/{officeId}";
	public static final String CREATE_DEALER_DETAILS="/protek/dealer/create";
	public static final String DELETE_DEALER_DETAILS="/protek/dealer/delete/{dealerId}";
	public static final String GET_BY_DEALERNAME="/protek/dealer/dealerName/{dealerName}";
	public static final String DELETE_DEALER_BYNAME="/protek/delete/dealer/byname/{dealerName}";
	
	public static final String GET_DEALERADRESS_ID="/protek/dealeradress/details/{adressId}";
	public static final String DELETE_DEALERADRESS_ID="/protek/dealeradress/delete/{adressId}";
	public static final String CREATE_DEALERADRESS="/protek/dealeradress/create";
	public static final String GET_ALL_DEALERS="/protek/dealers/get/alldetails";
	
	public static final String GET_MYCATEGORYS_DETAILS="/protek/mycategory/details/{categoryName}";
	public static final String CREATE_MYCATEGORY_DETAILS="/protek/mycategory/create";
	public static final String GET_ALL_MYCATEGORYS_DETAILS ="/protek/mycategory/getall/details";
	public static final String GET_ALL_MYCATEGORYS_BYNUMBER ="/protek/mycategory/get/bynumber/{catno}";
	public static final String DELETE_MYCATEGORYS_DETAILS ="/protek/mycategory/delete/categoryId/{categoryId}";
	
	public static final String GETALL_MYSUBCATEGORY_DETAILS ="/protek/mysubcategory/all/details";
	public static final String GETALL_MYSUBCATEGORY_DETAILS_BYNAME="/protek/mysubctegory/details/{byName}";
	public static final String CREATE_MYSUBCATEGORY_DETAILS ="/protek/mysubcategory/create";
	public static final String DELETE_MYSUBCATEGORYS_DETAILS ="/protek/mysubcategory/delete/{subCategoryId}";
	public static final String GETALL_MYSUBCATEGORY_DETAILS_BYNUMBER ="/protek/subcategorydemo/get/num/{catid}";
	public static final String SUBCATEGORY_UPDATE ="/protek/subcategory/update/details/{id}";
	
	public static final String GET_ITEM_ID = "/protek/item/details/{itemId}";
	public static final String DELETE_ITEM_ID = "/protek/item/delete/{itemId}";
	public static final String CREATE_ITEM_ID = "/protek/item/create";
	public static final String CREATE_ITEM_DETAILS ="/protek/item/create/multiple/records";
	public static final String GET_ALL_ITEM_DETAILS ="/protek/item/fetch/multiplerecords";
	public static final String GET_ALL_ITEMS_BYNAME ="/protek/item/fetch/allrecords/byname/{itemName}";
	
	public static final String GET_ALL_ITEMESUEMENTS_DETAILS = "/cgs/item/fetch/all/measurment/details";
	
	public static final String CREATE_SELLING_ORDER ="/protek/sellingorder/create";
	public static final String GET_ALL_SELLING_DETAILS ="/protek/sellingorder/get/all";
	public static final String GET_SELLING_ORDER_NAME ="/protek/sellingorder/fetch/byname/{agentId}";
	public static final String CREATE_SELLING_ORDER_MULTIPLE ="/protek/create/sellingOrdre/multilple/records";
	public static final String GET_SELLING_ORDER_BY_NO ="/protek/sellingorder/get/{selOrderNo}";
	
	public static final String GET_MYUSER_AUTHONTICATION ="/protek/myuser/get/authenticate/{username}/{password}";
	public static final String CREATE_USER_DETAILS ="/protek/create/user/username";
	
	public static final String CREATE_AGENTQUATATION_ORDER_MULTIPLE ="/protek/create/agentquation/Multiple/records";
	public static final String GET_ALL_AGENTQUATATION_DETAILS ="/protek/agentquation/get/multiplerecords";
	public static final String AGENTQUATATION_UPDATE ="/protek/agentquation/update/record/{id}";
	public static final String GET_AGENTQUATION_ORDER_NAME  ="/protek/get/agentquatino/byName/{agentName}";
	public static final String CREATE_JSON_DATA_AGENT_QUATATION="/protek/agentquation/create/multipule/order";
	public static final String GET_AGENQUATATION_BY_ORDERNO="/protek/agentquatation/get/by/orderno/{orderNo}";
	public static final String DELETE_AGENTQUATION_ORDER_ID ="/protek/agentquatation/delete/{sellingId}";
	
	public static final String CREATE_SHOPER_DETAILS ="/protek/shoper/create/details";
	public static final String GET_SHOPER_BY_NAME ="/protek/shoper/get/shoperName/{shoperName}";
	public static final String CREATE_MULTIPLE_SHOPER_DETAILS ="/protek/shoper/create/multipe/shopers";
	public static final String GET_MULTIPLE_SHOPERORDER_DETAILS = "/protek/shoperOrder/get/multipule/records";
	
	public static final String BUY_MULTIPLR_ITEMS_PURCHAGEORDER ="/protek/onlineshoping/fetch/recordsList";
	public static final String BILLING_ONLINE_PURCHAGE_ITEM ="/protek/bulling/create/multiple/items/details";
	public static final String CREATE_BUY_ITEMS_ONLINESHOPING_PURCHAGE ="/protek/buy/multipule/items/in/onlinepurchage";
	public static final String CREATE_ONLINE_PURCHAGE ="/protek/create/onlinepurchage/record";
	public static final String GET_PURCHAGEORDER_ITEM_BY_ORDERNO ="/protek/get/all/onlinpurchage/by/orderNo/{orderNo}";
	
	
	public static final String CREATE_CGSSERVICE_DETAILS ="/protek/service/create";
	public static final String GET_ALL_SERVICEINFO_DETAILS ="/protek/serviceinfo/get/service";
	public static final String UPDATE_SERVICE_DETAILS ="/protek/service/update/service/{serviceid}";
	public static final String GET_SERVICEINFO_BY_NAME ="/protek/serviceinfo/getserviceInfo/name/{serviceName}";
	public static final String CREATE_BUY_ONLINESERVICE_PURCHAGE ="/protek/service/multiple/creates";
	public static final String GET_ALL_SERVICEINFO_DETAILS_MUL ="/protek/service/get/mul/service/details";
	public static final String GET_SERVICEINFO_BY_COMPANYNAME ="/protek/service/get/service/by/companyname/{serviceid}";
	
	public static final String CREATE_SUPPLAIRORDER_DETAILS = "/protek/supplair/create";
	public static final String CREATE_SUPPLAIR_ORDER_MULTIPLE = "/protek/create/supplairorder/details";
	public static final String GET_SUPPLAIR_ORDER_BY_SUPPLIERNAME ="/protek/get/list/supplierorder/byname/{supplierName}";
	public static final String SUPPLIEROREDER_UPDATE_BY_ORDERNO ="/protek/update/supplierorder/records/{idSupplairOrder}";
	
	
	public static final String CREATE_SUPLIER_EMPLOYEE_DETAILS ="/protek/create/supplier/employee/details";
	public static final String GET_SUPPLIER_EMPLOYEE_DETAILS ="/protek/get/sup/employee";
	public static final String DELETE_SHOPER_EMPLOYEE_ORDER_ID ="/protek/delete/sup/eployee/Id/{sempId}";
	
	public static final String CREATE_CGSSTOCK_ORDER = "/protek/cgsstock/create";
	public static final String GET_CGSSTOCK_BY_ORDERNO ="/protek/cgsstock/get/details/{orderNo}";
	public static final String CREATE_JSON_DATA_CGSSTOCK_ORDER ="/protek/cgsstock/created/multipule/data";
	public static final String GET_ALL_CGSSTOCK_DETAILS ="/protek/cgsstock/get/by/group/details";
	public static final String DELETE_CGSSTOCK_ORDER_ID ="/protek/cgsstock/delete/details/{orederid}";
	public static final String CGSSTOCK_UPDATE_DETAILS ="/cgs/cgsstock/update/details/{id}";
	public static final String CGSSTOCK_UPDATE_PURCHGE_DETAILS ="/protek/cgsstock/update/amount/{id}/{totalAmount}";
	public static final String CGSSTOCK_UPDATE_SELLING_DETAILS ="/protek/cgsstock/sellprice/{id}";
	public static final String GET_CGSSTOCK_STATUSTRACK_BY_ORDERNO ="/protek/cgsstock/get/track/id/{orderNo}";
	
	public static final String CREATE_CGSHOMESERVICE_DETAILS ="/protek/cgshomeservice/images";
	public static final String GET_CGSHOMESERVICE_DOWNLOAD_DETAILS ="/protek/cgshome/get/{fileId}";
	public static final String CGSHOME_FILEUPLOAD_DED ="/protek/cgshome/fileupload";
	
	public static final String CREATE_CGS_STOCK_MASTER ="/protek/master/create/details";
	
	
	public static final String GET_CGSROLES_DETAILS ="/protek/get/cgsrole/details";
	public static final String GET_CGSROLES_DETAILS_BYID="/protek/get/cgsrole/byId/{roleId}";
	
	public static final String CREATE_CARDS_ORDER="/create/cgslacs/details";
	public static final String GET_ALL_CGSCARDS_DETAILS ="/cgs/cgscards/get/cards/details";
	
	public static final String CREATE_DISCOUNT_ORDER="/cgslacs/discount/create/details";
		
	public static final String CREATE_SYSTEM_DISCOUNT_ORDER ="/cgs/system/discoutn/create/details";
	public static final String GET_SYSTEM_DISCOUNT_ALL_DETAILS ="/cgs/system/discount/get/alldetails";
	
	public static final String CREATE_CGSDISCOUT_CATEGORY ="/cgs/discount/category/create/details";
	public static final String GET_DISCOUNT_CATEGORY_ALL_DETAILS ="/cgs/discout/category/get/details";
	
	public static final String CREATE_DISCOUNT_AREA ="/cgs/discount/area/create/details";
	public static final String GET_DISCOUNT_AREA_ALL_DETAILS ="/cgs/discount/area/get/all/details";
}