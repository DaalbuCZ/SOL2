.class public final enum Ll5/k;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll5/k;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum n:Ll5/k;

.field private static final o:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation
.end field

.field private static final synthetic p:[Ll5/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll5/k;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll5/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll5/k;->n:Ll5/k;

    const/4 v1, 0x1

    new-array v1, v1, [Ll5/k;

    aput-object v0, v1, v2

    sput-object v1, Ll5/k;->p:[Ll5/k;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll5/k;->o:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll5/k;
    .locals 1

    const-class v0, Ll5/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll5/k;

    return-object p0
.end method

.method public static values()[Ll5/k;
    .locals 1

    sget-object v0, Ll5/k;->p:[Ll5/k;

    invoke-virtual {v0}, [Ll5/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll5/k;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ll5/k;->o:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
