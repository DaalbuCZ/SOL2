.class public final synthetic Li7/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/h;


# static fields
.field public static final synthetic a:Li7/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/d;

    invoke-direct {v0}, Li7/d;-><init>()V

    sput-object v0, Li7/d;->a:Li7/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ly4/i;
    .locals 0

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/j$a;

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/a;->a(Lcom/google/firebase/remoteconfig/internal/j$a;)Ly4/i;

    move-result-object p1

    return-object p1
.end method
