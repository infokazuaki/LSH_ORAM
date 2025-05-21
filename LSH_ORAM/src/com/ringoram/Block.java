package com.ringoram;
//変更しようとしているコード //
/*public class Block {
	private BlockHeader header;
	private BlockBody body;

	public Block() {
		this.header = new BlockHeader();
		this.body = new BlockBody();
	}

	public Block(BlockHeader header, BlockBody body) {
		this.header = header;
		this.body = body;
	}

	public Block(int blockIndex, int leafId, byte[] data) {
		this.header = new BlockHeader(blockIndex, leafId);
		this.body = new BlockBody(data);
	}

	public BlockHeader getHeader() {
		return header;
	}

	public void setHeader(BlockHeader header) {
		this.header = header;
	}

	public BlockBody getBody() {
		return body;
	}

	public void setBody(BlockBody body) {
		this.body = body;
	}
}*/
public class Block { //元のコード
	private int blockIndex;//block unique index
	private int leaf_id;//block path id
	private byte[] data;//block payload
	private byte topicBits; 
	
	public Block(){
		this.blockIndex = -1;
		this.leaf_id = -1;
		this.data = new byte[Configs.BLOCK_DATA_LEN];
		this.topicBits = 0;
	}
	
	public Block( int blockIndex, int leaf_id, byte[] data){
		this.blockIndex = blockIndex;
		this.leaf_id = leaf_id;
		this.data = data;
		this.topicBits = 0;
	}
	public Block(int blockIndex, int leaf_id, byte[] data, byte topicBits) {
		this.blockIndex = blockIndex;
		this.leaf_id = leaf_id;
		this.data = data;
		this.topicBits = topicBits;
	}
	
	public int getBlockIndex() {
		return blockIndex;
	}
	public void setBlockIndex(int blockIndex) {
		this.blockIndex = blockIndex;
	}
	public int getLeaf_id() {
		return leaf_id;
	}
	public void setLeaf_id(int leaf_id) {
		this.leaf_id = leaf_id;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	// 追加されたフィールド用のゲッター/セッター
	public byte getTopicBits() {
		return topicBits;
	}

	public void setTopicBits(byte topicBits) {
		this.topicBits = topicBits;
	}

}