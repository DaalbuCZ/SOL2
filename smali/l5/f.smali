.class public final synthetic Ll5/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk5/h;


# static fields
.field public static final synthetic a:Ll5/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll5/f;

    invoke-direct {v0}, Ll5/f;-><init>()V

    sput-object v0, Ll5/f;->a:Ll5/f;

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

    invoke-static {p1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->e(Lk5/e;)Ljava/util/concurrent/Executor;

    move-result-object p1

    return-object p1
.end method
