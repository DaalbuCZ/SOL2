.class public final synthetic Lk5/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/j;


# static fields
.field public static final synthetic b:Lk5/i;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk5/i;

    invoke-direct {v0}, Lk5/i;-><init>()V

    sput-object v0, Lk5/i;->b:Lk5/i;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 0

    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
