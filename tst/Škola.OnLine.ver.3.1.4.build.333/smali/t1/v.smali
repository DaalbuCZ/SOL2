.class public final synthetic Lt1/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt1/m0$b;


# static fields
.field public static final synthetic a:Lt1/v;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt1/v;

    invoke-direct {v0}, Lt1/v;-><init>()V

    sput-object v0, Lt1/v;->a:Lt1/v;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lt1/m0;->X(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
