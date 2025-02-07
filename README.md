# NumberClassificationApi_Funfact
An Api that fetches the properties and fun fact about any natural number using an external api call.

## API Endpoint
  -  **Base URL:** `http://numberclassificationapi-funfact-env.eba-dpzznybj.us-east-1.elasticbeanstalk.com/api/classify-number?number=371`
  -  **GET /api/classify-number:** - Fetches the properties and funfact about any natural number.
  -  **GITHUB URL: `https://github.com/NecyNazy/NumberClassificationApi_Funfact`

## JSON Response Format (200 OK)
```json
{
  "number": "371",
  "is_prime": false,
  "is_perfect": false,
  "properties": ["armstrong", "odd"]
  "digit_sum": 11, //sum of its digits
  "fun_fact": "371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371" //gotten from the numbers API
}
```

## JSON Response Format (400 Bad Request)
```json
{
  "number": "alphabet",
  "error": true
}
```
## Acceptance Criteria
- Accepts GET requests with a number parameter.
- Returns JSON in the specified format.
- Accepts all valid integers as the only possible inputs.
- Provides appriopriate HTTP status codes.

