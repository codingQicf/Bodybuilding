// pages/login/login.js
const { $Toast } = require('../../dist/base/index');

Page({

  /**
   * 页面的初始数据
   */
  data: {

    /**
     * 登录页面-视频连接
     */
    videoUrl:'https://ugcws.video.gtimg.com/uwMRJfz-r5jAYaQXGdGnC2_ppdhgmrDlPaRvaV7F2Ic/k0389for0yw.p712.1.mp4?sdtfrom=v1010&guid=2454969e7453b5f495ccd517ac999884&vkey=4187E0B55E344E560DD1309AAB199354EC1D769E90B5C4FE6B0AB24BB2CA1C6E6FDD53E85A0262A407A76F82CB92F8BA13263473B79F61921CE11BB7F6B15ED4F7008F5553200F9FF84AED24C04AAD9527C4E499CC84DDE1E94664885E7978F0AC8BD6E4D329F8DC961916F387B29384BA21C606B3CA3677',

    /**
     * 用户信息
     */
    username:'test111',
    password:'pwd1111',

    /**
     * url配置信息
     */
    url:"http://localhost:90/",
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  //注册
  loginClick(e){

    console.log('[你当前在执行登录/注册操作]'+this.data.username,this.data.password)

    wx.request({
      url:  this.data.url+'1007'+'?username='+this.data.username+'&password='+this.data.password, // 仅为示例，并非真实的接口地址
      data: {
      },
      method: "GET",
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res)
        wx.reLaunch({
          url: '/pages/index/index'
        })
      }
    })
      
    




  }

})