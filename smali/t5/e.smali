.class public final synthetic Lt5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt5/h$a;


# static fields
.field public static final synthetic a:Lt5/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt5/e;

    invoke-direct {v0}, Lt5/e;-><init>()V

    sput-object v0, Lt5/e;->a:Lt5/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lt5/h;->e(Landroid/util/JsonReader;)Ls5/b0$d$b;

    move-result-object p1

    return-object p1
.end method
