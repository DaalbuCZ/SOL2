.class public final synthetic Ll5/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/b;


# static fields
.field public static final synthetic a:Ll5/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll5/a;

    invoke-direct {v0}, Ll5/a;-><init>()V

    sput-object v0, Ll5/a;->a:Ll5/a;

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

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
