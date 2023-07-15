<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>

<h3 align="center"></h3>

  <p align="center">
     Bloomberg FX deals
  </p>


<!-- ABOUT THE PROJECT -->
## About The Project
We are part of a scrum team developing data warehouse for Bloomberg to analyze FX deals. One of customer stories is to accept deals details from and persist them into DB. And that is what we are implementing here.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* JAVA spring boot
* Maven
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Prerequisites 
* Docker
* JAVA JDK



<!-- GETTING STARTED -->
## Getting Started

### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Clone the repo
   ```sh
   git clone https://github.com/MahmoudAltrify/Bloomberg-fx-deals.git
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Available endpoints
* Get all deals
  * Request
    ```sh
    curl --location 'http://localhost:8080/api/v1/deals' \
      --header 'Accept: application/json' \
      --header 'Content-Type: application/json'
     ```
  * Responce
    ```sh
    [{
    "id": 1,
    "fromCurrency": "JOD",
    "toCurrency": "USD",
    "dealTime": "2023-07-15T19:21:04",
    "amount": 100.00
    }]
     ```
    
* Create new deal 
  * Request 
  ```sh
    curl --location 'http://localhost:8080/api/v1/deals' \
      --header 'Accept: application/json' \
      --header 'Content-Type: application/json' \
      --data '{
      "fromCurrency": "JOD",
      "toCurrency": "USD",
      "amount": 10043
      }'
     ```

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>
