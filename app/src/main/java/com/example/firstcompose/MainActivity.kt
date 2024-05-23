package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirsTComposeTheme
import data.Dog
import data.dogs
import java.math.BigDecimal
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirsTComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    //Carte( from ="Android Developer Extraordinaire" , name = "Android Developer Extraordinaire", email = "21km217@esisalama.org", share = "@AdroideDev")
                    //Roll()
                   //LemonadeApp()
                    WoofApp()


                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center
    )
    Text(
        text = from,
        fontSize = 36.sp,
        modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)

    )
}}


@Composable
fun GreetingImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center

        )
    }
}


@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.all_task_completed),
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp
        )
    }
}

@Composable
fun Carte(from :String,name:String,email:String,share:String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.android_logo)
    val colors=Color(android.graphics.Color.parseColor("#0F3A63"))

    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center){

        Spacer(modifier = Modifier.height(250.dp))

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier= Modifier
                .padding(8.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .height(100.dp)
                .width(100.dp)
                .background(Color.Black)


        )

        Text(
            text = "KIBWE ET KAVAO",
            fontSize = 20.sp ,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier= Modifier
                .padding(4.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold
        )
        Text(text = from  ,
            fontSize = 18.sp,
            color = colors,
            modifier= Modifier
                .padding(8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(150.dp))

        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,

                )
            Text(
                text = "+243 97 54 81 773 ",
                fontSize = 14.sp ,
            )
        }


        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = stringResource(id = R.string.shopping_cart_content_desc),

                )
            Text(
                text = share,
                fontSize = 14.sp
            )
        }
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription =null
                )
            Text(
                text = email,
                fontSize = 14.sp ,
            )

        }
        
    }

}


@Composable
fun  Roll1(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



    }
}


@Composable
fun Roll(modifier: Modifier = Modifier) {
    var result by remember { mutableIntStateOf( 1) }
    val imageResource = when(result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(modifier = modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center )
        {
        Image(painter = painterResource(imageResource), contentDescription =null)

        Button(
            onClick = { result = (1..6).random() },
        ) {
            Text(text = stringResource(R.string.roll), fontSize = 24.sp)
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun LemonadeApp() {

    var currentStep by remember { mutableStateOf(1) }

    var squeezeCount by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Lemonade",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.tertiaryContainer),
            color = MaterialTheme.colorScheme.background
        ) {
            when (currentStep) {
                1 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_select,
                        drawableResourceId = R.drawable.lemon_tree,
                        contentDescriptionResourceId = R.string.lemon_tree_content_description,
                        onImageClick = {
                            currentStep = 2
                            squeezeCount = (2..4).random()
                        }
                    )
                }
                2 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_squeeze,
                        drawableResourceId = R.drawable.lemon_squeeze,
                        contentDescriptionResourceId = R.string.lemon_content_description,
                        onImageClick = {
                            squeezeCount--
                            if (squeezeCount == 0) {
                                currentStep = 3
                            }
                        }
                    )
                }

                3 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_drink,
                        drawableResourceId = R.drawable.lemon_drink,
                        contentDescriptionResourceId = R.string.lemonade_content_description,
                        onImageClick = {
                            currentStep = 4
                        }
                    )
                }
                4 -> {
                    LemonTextAndImage(
                        textLabelResourceId = R.string.lemon_empty_glass,
                        drawableResourceId = R.drawable.lemon_restart,
                        contentDescriptionResourceId = R.string.empty_glass_content_description,
                        onImageClick = {
                            currentStep = 1
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun LemonTextAndImage(
    textLabelResourceId: Int,
    drawableResourceId: Int,
    contentDescriptionResourceId: Int,
    onImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = onImageClick,
                shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
            ) {
                Image(
                    painter = painterResource(drawableResourceId),
                    contentDescription = stringResource(contentDescriptionResourceId),
                    modifier = Modifier
                        .width(dimensionResource(R.dimen.button_image_width))
                        .height(dimensionResource(R.dimen.button_image_height))
                        .padding(dimensionResource(R.dimen.button_interior_padding)))
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_vertical)))
            Text(
                text = stringResource(textLabelResourceId),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
@Composable
fun TipTimeLayout() {
    var billAmount by remember { mutableStateOf(0.0) }
    var tipPercent by remember { mutableStateOf(15.0) }
    val tipAmount = calculateTip(billAmount, tipPercent)

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        TextField(
            value = billAmount.toString(),
            onValueChange = { billAmount = it.toDoubleOrNull() ?: 0.0 },
            label = { Text(stringResource(R.string.bill_amount)) },
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(R.string.tip_percent))
            Slider(
                value = tipPercent.toFloat(),
                onValueChange = { tipPercent = it.toDouble() },
                //valueRange = 0.0..100.0,
                steps = 5
            )
        }
        Text(
            text = stringResource(R.string.tip_amount, tipAmount.toFormattedString()),
            style = MaterialTheme.typography.displaySmall
        )
    }
}

private fun calculateTip(amount: Double, tipPercent: Double): BigDecimal {
    val tip = tipPercent / 100 * amount
    return BigDecimal(tip).setScale(2)
}

private fun BigDecimal.toFormattedString(): String {
    return NumberFormat.getCurrencyInstance().format(this)
}


/**
 * Composable that displays an app bar and a list of dogs.
 */
@Composable
fun WoofApp() {
    Scaffold(
        topBar = {
            WoofTopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(dogs) {
                DogItem(
                    dog = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}
/**
 * Composable that displays a list item containing a dog icon and their information.
 *
 * @param dog contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
fun DogItem(
    dog: Dog,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_small))
        ) {
            DogIcon(dog.imageResourceId)
            DogInformation(dog.name, dog.age)
        }
    }
}

/**
 * Composable that displays a photo of a dog.
 *
 * @param dogIcon is the resource ID for the image of the dog
 * @param modifier modifiers to set to this composable
 */
@Composable
fun DogIcon(
    @DrawableRes dogIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small),

        painter = painterResource(dogIcon),
        contentScale = ContentScale.Crop,

        // Content Description is not needed here - image is decorative, and setting a null content
        // description allows accessibility services to skip this element during navigation.

        contentDescription = null
    )

}

/**
 * Composable that displays a dog's name and age.
 *
 * @param dogName is the resource ID for the string of the dog's name
 * @param dogAge is the Int that represents the dog's age
 * @param modifier modifiers to set to this composable
 */
@Composable
fun DogInformation(
    @StringRes dogName: Int,
    dogAge: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(dogName),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(id = R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.years_old, dogAge),
            style = MaterialTheme.typography.bodyLarge)
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WoofTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size))
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    painter = painterResource(R.drawable.ic_woof_logo),

                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}
/**
@Preview(showBackground = true , showSystemUi = true )
@Composable
fun GreetingPreview() {
    FirsTComposeTheme {


      //  Carte( from ="Android Developer Extraordinaire" , name = "Android Developer Extraordinaire", email = "21bm316@gmail.com.com", share = "@AdroideDev")
     // Roll()
    // GreetingImage()
   // LemonadeApp()



    }
}
**/


/**
 * Composable that displays what the UI of the app looks like in light theme in the design tab.
 */
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WoofPreview() {
    FirsTComposeTheme {
        FirsTComposeTheme(darkTheme = true) {
            WoofApp()
        }
    }
}