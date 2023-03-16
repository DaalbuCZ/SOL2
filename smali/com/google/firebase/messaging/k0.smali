.class public abstract Lcom/google/firebase/messaging/k0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Le6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Le6/h;->a()Le6/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lc6/a;

    invoke-virtual {v0, v1}, Le6/h$a;->d(Lc6/a;)Le6/h$a;

    move-result-object v0

    invoke-virtual {v0}, Le6/h$a;->c()Le6/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/k0;->a:Le6/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/k0;->a:Le6/h;

    invoke-virtual {v0, p0}, Le6/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lp6/b;
.end method
