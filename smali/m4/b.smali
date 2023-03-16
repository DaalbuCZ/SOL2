.class public final Lm4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final n:Lm4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm4/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm4/b;-><init>(ZLm4/d;)V

    sput-object v0, Lm4/b;->n:Lm4/b;

    return-void
.end method

.method private constructor <init>(ZLm4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLm4/c;)Lm4/b;
    .locals 0

    sget-object p0, Lm4/b;->n:Lm4/b;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
