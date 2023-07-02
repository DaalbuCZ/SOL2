.class public final Lr4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final n:Lr4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr4/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr4/b;-><init>(ZLr4/d;)V

    sput-object v0, Lr4/b;->n:Lr4/b;

    return-void
.end method

.method private constructor <init>(ZLr4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLr4/c;)Lr4/b;
    .locals 0

    sget-object p0, Lr4/b;->n:Lr4/b;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
