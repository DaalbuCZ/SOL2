.class public final synthetic Lcom/google/firebase/messaging/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le1/e;


# static fields
.field public static final synthetic a:Lcom/google/firebase/messaging/g0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/messaging/g0;

    invoke-direct {v0}, Lcom/google/firebase/messaging/g0;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/g0;->a:Lcom/google/firebase/messaging/g0;

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

    check-cast p1, Lp6/b;

    invoke-virtual {p1}, Lp6/b;->c()[B

    move-result-object p1

    return-object p1
.end method
