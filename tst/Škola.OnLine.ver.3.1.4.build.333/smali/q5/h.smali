.class public final synthetic Lq5/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# static fields
.field public static final synthetic a:Lq5/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lq5/h;

    invoke-direct {v0}, Lq5/h;-><init>()V

    sput-object v0, Lq5/h;->a:Lq5/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp5/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->h(Lp5/e;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    return-object p1
.end method
