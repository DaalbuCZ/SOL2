.class public final synthetic Ld7/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/b;


# static fields
.field public static final synthetic a:Ld7/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld7/m;

    invoke-direct {v0}, Ld7/m;-><init>()V

    sput-object v0, Ld7/m;->a:Ld7/m;

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

    invoke-static {}, Lcom/google/firebase/remoteconfig/c;->a()Li5/a;

    move-result-object v0

    return-object v0
.end method
