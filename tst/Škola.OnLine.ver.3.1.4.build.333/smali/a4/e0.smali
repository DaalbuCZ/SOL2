.class public final synthetic La4/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final synthetic n:La4/e0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, La4/e0;

    invoke-direct {v0}, La4/e0;-><init>()V

    sput-object v0, La4/e0;->n:La4/e0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
