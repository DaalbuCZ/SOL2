.class public final synthetic Lt5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt5/h$a;


# static fields
.field public static final synthetic a:Lt5/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt5/b;

    invoke-direct {v0}, Lt5/b;-><init>()V

    sput-object v0, Lt5/b;->a:Lt5/b;

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

    invoke-static {p1}, Lt5/h;->b(Landroid/util/JsonReader;)Ls5/b0$a$a;

    move-result-object p1

    return-object p1
.end method
