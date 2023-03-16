.class public final synthetic Ll5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/h;


# static fields
.field public static final synthetic a:Ll5/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll5/e;

    invoke-direct {v0}, Ll5/e;-><init>()V

    sput-object v0, Ll5/e;->a:Ll5/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk5/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a(Lk5/e;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    return-object p1
.end method
