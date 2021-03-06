#ifndef _WAYPOINT_H_
#define _WAYPOINT_H_

#include "../DataTypes/CppDataTypes.hpp"
namespace Talc{
namespace Avionique{

	struct Waypoint{
		public: UInt32 m_id ;
		
		public: Float64 m_x ;
		
		public: Float64 m_y ;
		
		public: Float64 m_z ;
		
		public: Float64 m_cap ;
		
		public: Float64 m_derap ;
		
		public: Float64 m_vel ;
		
		public: Float64 m_v_prox ;
		
		public: Float64 m_d_prox ;
		
		public: Float64 m_wait ;
		
  
};

}
}

#endif // _WAYPOINT_H_
