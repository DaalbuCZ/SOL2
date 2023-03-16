.class public final synthetic Lz6/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le1/e;


# static fields
.field public static final synthetic a:Lz6/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/a;

    invoke-direct {v0}, Lz6/a;-><init>()V

    sput-object v0, Lz6/a;->a:Lz6/a;

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

    check-cast p1, Lb7/i;

    invoke-virtual {p1}, Lcom/google/protobuf/a;->x()[B

    move-result-object p1

    return-object p1
.end method
