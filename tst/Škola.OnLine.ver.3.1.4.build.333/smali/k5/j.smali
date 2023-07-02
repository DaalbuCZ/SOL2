.class public final synthetic Lk5/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/h$a;


# static fields
.field public static final synthetic a:Lk5/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk5/j;

    invoke-direct {v0}, Lk5/j;-><init>()V

    sput-object v0, Lk5/j;->a:Lk5/j;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
