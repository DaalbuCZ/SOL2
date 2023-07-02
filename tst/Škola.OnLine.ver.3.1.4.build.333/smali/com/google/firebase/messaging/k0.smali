.class public abstract Lcom/google/firebase/messaging/k0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lj6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lj6/h;->a()Lj6/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lh6/a;

    invoke-virtual {v0, v1}, Lj6/h$a;->d(Lh6/a;)Lj6/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lj6/h$a;->c()Lj6/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/k0;->a:Lj6/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/k0;->a:Lj6/h;

    invoke-virtual {v0, p0}, Lj6/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lu6/b;
.end method
