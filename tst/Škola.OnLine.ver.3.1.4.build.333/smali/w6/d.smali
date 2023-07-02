.class public final synthetic Lw6/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# static fields
.field public static final synthetic a:Lw6/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw6/d;

    invoke-direct {v0}, Lw6/d;-><init>()V

    sput-object v0, Lw6/d;->a:Lw6/d;

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

    invoke-static {p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->a(Lp5/e;)Lw6/e;

    move-result-object p1

    return-object p1
.end method
