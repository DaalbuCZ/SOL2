.class public final synthetic Lt3/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/l;


# static fields
.field public static final synthetic n:Lt3/w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lt3/w;

    invoke-direct {v0}, Lt3/w;-><init>()V

    sput-object v0, Lt3/w;->n:Lt3/w;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lt3/u$c;->f(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
