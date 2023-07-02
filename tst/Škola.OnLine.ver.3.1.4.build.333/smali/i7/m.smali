.class public final synthetic Li7/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/b;


# static fields
.field public static final synthetic a:Li7/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/m;

    invoke-direct {v0}, Li7/m;-><init>()V

    sput-object v0, Li7/m;->a:Li7/m;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/c;->a()Ln5/a;

    move-result-object v0

    return-object v0
.end method
