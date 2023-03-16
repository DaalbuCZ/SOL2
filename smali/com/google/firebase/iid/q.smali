.class final synthetic Lcom/google/firebase/iid/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# static fields
.field static final a:Lt4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/iid/q;

    invoke-direct {v0}, Lcom/google/firebase/iid/q;-><init>()V

    sput-object v0, Lcom/google/firebase/iid/q;->a:Lt4/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt4/i;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/iid/Registrar$a;->e(Lt4/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
